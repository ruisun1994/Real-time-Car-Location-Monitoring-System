package com.yangfei.spring.uber.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Yangfei on 12/31/17.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@RequiredArgsConstructor
@Embeddable
public class FaultCode {
    private String engineMake;
    private String faultCode;
    private String faultCodeId;
    private String faultCodeClassification;
    private String description;
    @Column(length = 1024)
    private String repairInstructions;
    private Long fmi;
    private String sa;
    private Long spn;
}