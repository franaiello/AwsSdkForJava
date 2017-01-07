# Learning AWS SDK Learning
I currently have two separate sections (DynamoDB and SNS) within this project in order to learn some of the programmatic aspects of AWS SDK.  

The exercises within this repo are taken from their website and modified according to my needs so full credit is given to Amazon and any code seen here is solely for educational purposes.

## Learning DynamoDB
In learning Amazon Web Services (AWS) I found the following useful for learning DynamoDB.  

Amazon provides the ability to interact locally without incurring charges by downloading a local DynamoDB instance that can be seen [here](https://aws.amazon.com/blogs/aws/dynamodb-local-for-desktop-development/) are the instructions on how to download and get running easily.

My preference for installing binaries such as this is to place in my ~/bin where I keep downloaded binaries and run from that location so as not to mingle with operating system binaries

As an example I used the following syntax to launch DynamoDB locally; 

```
localhost:~ francisaiello$ cd ~/bin/dynamodb_local_2016-05-17/
localhost:dynamodb_local_2016-05-17 francisaiello$ java -Djava.library.path=./DynamoDBLocal_lib/ -jar DynamoDBLocal.jar
Initializing DynamoDB Local with the following configuration:
Port:	8000
InMemory:	false
DbPath:	null
SharedDb:	false
shouldDelayTransientStatuses:	false
CorsParams:	*
```

The exercises included here can be found [here](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/JavaDocumentAPICRUDExample.html)

I also downloaded the sample Movie data in JSON format as described [here](http://docs.aws.amazon.com/amazondynamodb/latest/gettingstartedguide/GettingStarted.Java.02.html)

## Learning SNS
This particular exercise will send a SNS notification message to a specific phone number.  