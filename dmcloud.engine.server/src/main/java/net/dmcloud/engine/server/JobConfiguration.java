package net.dmcloud.engine.server;

import net.dmcloud.engine.data.Observation;

import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

public class JobConfiguration {

    // tag::readerwriterprocessor[]
    @Bean
    public ItemReader<Observation> reader() {
        FlatFileItemReader<Observation> reader = new FlatFileItemReader<Observation>();
        reader.setResource(new ClassPathResource("sample-Observation.csv"));
        reader.setLineMapper(new DefaultLineMapper<Observation>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] { "firstName", "lastName" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Observation>() {{
                setTargetType(Observation.class);
            }});
        }});
        return reader;
    }

    @Bean
    public ItemProcessor<Observation, Observation> processor() {
        return new ObservationItemProcessor();
    }

    @Bean
    public ItemWriter<Observation> writer() {
        FlatFileItemWriter<Observation> writer = new FlatFileItemWriter<Observation>();
        writer.setResource(new ClassPathResource("sample-Observation.csv"));
        return writer;
    }
    
    // tag::jobstep[]
    @Bean
    public Job importUserJob(JobBuilderFactory jobs, Step s1, JobExecutionListener listener) {
        return jobs.get("NaiveBayesClassifier")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(s1)
                .end()
                .build();
    }
// tag::jobstep[]
    @Bean
    public Job importUserJob2(JobBuilderFactory jobs, Step s1, JobExecutionListener listener) {
        return jobs.get("ID3")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(s1)
                .end()
                .build();
    }
    

    @Bean
    public Step step1(StepBuilderFactory stepBuilderFactory, ItemReader<Observation> reader,
            ItemWriter<Observation> writer, ItemProcessor<Observation, Observation> processor) {
        return stepBuilderFactory.get("step1")
                .<Observation, Observation> chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }
}
