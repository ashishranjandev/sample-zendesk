package com.tesco.iam.stub.samplezendesk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ZendeskTicketComment implements Serializable {

    private static final long serialVersionUID = 6254984242395005425L;

    @JsonProperty("html_body")
    private String htmlBody;
}
