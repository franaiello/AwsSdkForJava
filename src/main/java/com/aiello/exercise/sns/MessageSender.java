package com.aiello.exercise.sns;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * The following Java class was taken from AWS
 * @see <a href="http://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html">Sending an SMS Message</a>
 */
public class MessageSender {
    public static void main(String[] args) {
        AmazonSNSClient snsClient = new AmazonSNSClient();
        String message = "My SMS message via AWS SDK";
        String phoneNumber = "+1XXX5550100";  // TODO: Replace with your own phone number to give it a try
        Map<String, MessageAttributeValue> smsAttributes = new HashMap<String, MessageAttributeValue>();
        sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
    }

    public static void sendSMSMessage(AmazonSNSClient snsClient,
                                      String message,
                                      String phoneNumber,
                                      Map<String, MessageAttributeValue> smsAttributes) {
        PublishResult result = snsClient.publish(new PublishRequest()
                .withMessage(message)
                .withPhoneNumber(phoneNumber)
                .withMessageAttributes(smsAttributes));
        System.out.println(result);
    }
}
