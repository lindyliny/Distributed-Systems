# Distributed-Systems
This respository has some initial examples for working with TCP and UDP Sockects using JAVA


## Prerequisites
This projects are tested in Eclipse using Java 8, JDK "1.8.0_141", and running on unix environments.

## Example

In order to run the TCP and UDP server/clients, open a terminal follow the next steps:

_1. Run the terminal server commands_
_2. Run terminal client commands 
_3. Check your terminal with the expect terminal output below_

### 1. Terminal input for localhost server
```
cd .../TCP-ServerExample/bin
java TCPServer
```

### 2. Terminal input for localhost client
```
cd .../TCP-ServerExample/bin
java TCPClient testMessage1 127.0.0.1

```

### 3. Expected output for localhost server
```
Server listening for a connection
Received connection 1
Server listening for a connection
server reading data
server writing data
```

### 3. Expected output for localhost client
```
Connection Established
Sending data
Received: testMessage1
```

## Multi-server system

@TO-DO


