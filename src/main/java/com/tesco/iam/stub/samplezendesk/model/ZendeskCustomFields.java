package com.tesco.iam.stub.samplezendesk.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ZendeskCustomFields implements Serializable {

    private static final long serialVersionUID = 2899689573321565057L;

    private Long id;

    private String value;
}
