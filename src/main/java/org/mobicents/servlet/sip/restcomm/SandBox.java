package org.mobicents.servlet.sip.restcomm;

import java.net.URI;

import org.joda.time.DateTime;

import org.mobicents.servlet.sip.restcomm.annotations.concurrency.Immutable;

@Immutable public final class SandBox {
  private final DateTime dateCreated;
  private final DateTime dateUpdated;
  private final String pin;
  private final Sid accountSid;
  private final String phoneNumber;
  private final Sid applicationSid;
  private final String apiVersion;
  private final URI voiceUrl;
  private final String voiceMethod;
  private final URI smsUrl;
  private final String smsMethod;
  private final URI statusCallback;
  private final String statusCallbackMethod;
  private final URI uri;

  public SandBox(final DateTime dateCreated, final DateTime dateUpdated, final String pin, final Sid accountSid,
      final String phoneNumber, final Sid applicationSid, final String apiVersion, final URI voiceUrl, final String voiceMethod,
      final URI smsUrl, final String smsMethod, final URI statusCallback, final String statusCallbackMethod, final URI uri) {
    super();
    this.dateCreated = dateCreated;
    this.dateUpdated = dateUpdated;
    this.pin = pin;
    this.accountSid = accountSid;
    this.phoneNumber = phoneNumber;
    this.applicationSid = applicationSid;
    this.apiVersion = apiVersion;
    this.voiceUrl = voiceUrl;
    this.voiceMethod = voiceMethod;
    this.smsUrl = smsUrl;
    this.smsMethod = smsMethod;
    this.statusCallback = statusCallback;
    this.statusCallbackMethod = statusCallbackMethod;
    this.uri = uri;
  }

  public DateTime getDateCreated() {
    return dateCreated;
  }

  public DateTime getDateUpdated() {
    return dateUpdated;
  }

  public String getPin() {
    return pin;
  }

  public Sid getAccountSid() {
    return accountSid;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Sid getApplicationSid() {
    return applicationSid;
  }

  public String getApiVersion() {
    return apiVersion;
  }

  public URI getVoiceUrl() {
    return voiceUrl;
  }

  public String getVoiceMethod() {
    return voiceMethod;
  }

  public URI getSmsUrl() {
    return smsUrl;
  }

  public String getSmsMethod() {
    return smsMethod;
  }

  public URI getStatusCallback() {
    return statusCallback;
  }

  public String getStatusCallbackMethod() {
    return statusCallbackMethod;
  }

  public URI getUri() {
    return uri;
  }
  
  public SandBox setVoiceUrl(final URI voiceUrl) {
    final DateTime dateUpdated = DateTime.now();
    return new SandBox(dateCreated, dateUpdated, pin, accountSid, phoneNumber, applicationSid, apiVersion, voiceUrl, voiceMethod,
        smsUrl, smsMethod, statusCallback, statusCallbackMethod, uri);
  }
  
  public SandBox setVoiceMethod(final String voiceMethod) {
    final DateTime dateUpdated = DateTime.now();
    return new SandBox(dateCreated, dateUpdated, pin, accountSid, phoneNumber, applicationSid, apiVersion, voiceUrl, voiceMethod,
        smsUrl, smsMethod, statusCallback, statusCallbackMethod, uri);
  }
  
  public SandBox setSmsUrl(final URI smsUrl) {
    final DateTime dateUpdated = DateTime.now();
    return new SandBox(dateCreated, dateUpdated, pin, accountSid, phoneNumber, applicationSid, apiVersion, voiceUrl, voiceMethod,
        smsUrl, smsMethod, statusCallback, statusCallbackMethod, uri);
  }
  
  public SandBox setSmsMethod(final String smsMethod) {
    final DateTime dateUpdated = DateTime.now();
    return new SandBox(dateCreated, dateUpdated, pin, accountSid, phoneNumber, applicationSid, apiVersion, voiceUrl, voiceMethod,
        smsUrl, smsMethod, statusCallback, statusCallbackMethod, uri);
  }
  
  public SandBox setStatusCallback(final URI statusCallback) {
    final DateTime dateUpdated = DateTime.now();
    return new SandBox(dateCreated, dateUpdated, pin, accountSid, phoneNumber, applicationSid, apiVersion, voiceUrl, voiceMethod,
        smsUrl, smsMethod, statusCallback, statusCallbackMethod, uri);
  }
  
  public SandBox setStatusCallbackMethod(final String statusCallbackMethod) {
    final DateTime dateUpdated = DateTime.now();
    return new SandBox(dateCreated, dateUpdated, pin, accountSid, phoneNumber, applicationSid, apiVersion, voiceUrl, voiceMethod,
        smsUrl, smsMethod, statusCallback, statusCallbackMethod, uri);
  }
}