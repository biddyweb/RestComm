package org.mobicents.servlet.restcomm.rvd.model.client;

import org.mobicents.servlet.restcomm.rvd.interpreter.Interpreter;
import org.mobicents.servlet.restcomm.rvd.model.rcml.RcmlDialStep;

public class DialStep extends Step {
    private String dialType;
    private String number;
    private String client;
    private String conference;
    private String sipuri;

    private String action;
    private String method;
    private Integer timeout;
    private Integer timeLimit;
    private String callerId;

    public String getDialType() {
        return dialType;
    }

    public void setDialType(String dialType) {
        this.dialType = dialType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getSipuri() {
        return sipuri;
    }

    public void setSipuri(String sipuri) {
        this.sipuri = sipuri;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }
    public RcmlDialStep render(Interpreter interpreter) {

        RcmlDialStep rcmlStep = new RcmlDialStep();
        if ("number".equals(getDialType()) && getNumber() != null && !"".equals(getNumber()))
            rcmlStep.setNumber(interpreter.populateVariables(getNumber()));
        else if ("client".equals(getDialType()) && getClient() != null && !"".equals(getClient()))
            rcmlStep.setClient(getClient());
        else if ("conference".equals(getDialType()) && getConference() != null && !"".equals(getConference()))
            rcmlStep.setConference(getConference());
        else if ("sipuri".equals(getDialType()) && getSipuri() != null && !"".equals(getSipuri()))
            rcmlStep.setSipuri(getSipuri());
        // TODO else ...

        return rcmlStep;
    }
}