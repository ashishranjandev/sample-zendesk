package com.tesco.iam.stub.samplezendesk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tesco.iam.stub.samplezendesk.model.ZendeskCreateTicketRequest;
import com.tesco.iam.stub.samplezendesk.model.ZendeskResponse;
import com.tesco.iam.stub.samplezendesk.model.ZendeskResponseTicket;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ZendeskController {


    @PostMapping(value = "/api/v2/tickets.json", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces =
            { MediaType.APPLICATION_JSON_VALUE })
    public ZendeskResponse createTicket(@RequestBody ZendeskCreateTicketRequest zendeskCreateTicketRequest) throws JsonProcessingException {
        System.out.println("Received a create Zendesk Ticket Request. Request Below ..");
        System.out.println("");
        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(zendeskCreateTicketRequest));
        ZendeskResponseTicket responseTicket = new ZendeskResponseTicket();
        responseTicket.setId(String.valueOf(System.currentTimeMillis()));
        ZendeskResponse response = new ZendeskResponse();
        response.setTicket(responseTicket);
        return response;
    }
}
