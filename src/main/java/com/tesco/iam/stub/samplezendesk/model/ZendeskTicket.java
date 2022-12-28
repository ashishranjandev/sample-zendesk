package com.tesco.iam.stub.samplezendesk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ZendeskTicket implements Serializable {

    private static final long serialVersionUID = 6801999274270135191L;

    private String subject;

    private ZendeskTicketComment comment;

    private String type;

    private String priority;

    private ZendeskTicketRequester requester;

    @JsonProperty("group_id")
    private String groupId;

    @JsonProperty("custom_fields")
    private List<ZendeskCustomFields> customFields;

    @JsonProperty("submitter_id")
    private Long submitterId;
}
