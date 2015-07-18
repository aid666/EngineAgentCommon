# DataMiningCloud Engine
DMC Engine is a distribution process flow system which deploy and run DataMiningCloud services.

## Concepts

### Algorithm

This is the real implementation for the execution. Every node has an algorithm and the model which is the parametrs of this algorithm.

### Ad_Hoc execution
For testing a DataMinging Service or a Trainer, there are lots request for the ad_hoc execution, which will not deploy a real ProcessFlow to the engine. So the ad_hoc execution will create a temporary procss flow, add will be removed automatically when the execution is finished.

### Deployed Process
For better performance, a process flow can be deployed to the engine and accept the input the data and handle that.

## Archticture
This is a distribution system which based on Docker and Consul.
There are 4 blocks:

Hub: Implementation of API service, a API gateway of the engine. And it will use DB to store the history result.

Consul: Wrap and hold dispatchers and agents. And used as datacenter.

Dispatcher: There will be 1+ dispatchers. It will handle a running of a service. A service is a map of processers. The dispatcher will send the input data as an event to the agent. And the agent will send another result data event to this dispatcher when it finished.

Agent: Will handle the running event. It has a ReST API endpoint including "get algorithm name", "check status" and "handle the input data". Every agent only has one algorithm. But it can hold several processes at the same time.
