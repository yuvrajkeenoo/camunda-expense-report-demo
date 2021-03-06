package com.camunda.bpm.servicesdemo.entity.common;

import com.camunda.bpm.servicesdemo.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="APPROVER")
public class Approver extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PARTICIPANT_ID")
    private Participant participant;
    @Column(name="APPROVAL_LEVEL")
    private Long approvalLevel;

    public Approver() {
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Long getApprovalLevel() {
        return approvalLevel;
    }

    public void setApprovalLevel(Long approvalLevel) {
        this.approvalLevel = approvalLevel;
    }
}
