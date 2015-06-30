# DataMiningCloud Engine

## Algorithm

This is the real implementation for the execution. Every node has an algorithm and the model which is the parametrs of this algorithm.

## Ad_Hoc execution
For testing a DataMinging Service or a Trainer, there are lots request for the ad_hoc execution, which will not deploy a real ProcessFlow to the engine. So the ad_hoc execution will create a temporary procss flow, add will be removed automatically when the execution is finished.

## Deployed Process
For better performance, a process flow can be deployed to the engine and accept the input the data and handle that.
