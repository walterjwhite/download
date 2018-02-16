package com.walterjwhite.download.api.model;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Download extends AbstractEntity {
  @Column protected String uri;
  @Column protected String signature;
  @Column protected String filename;

  public Download(String uri, String signature, String filename) {
    this();

    this.uri = uri;
    this.signature = signature;
    this.filename = filename;
  }

  public Download(String uri, String signature) {
    this(uri, signature, getFilename(uri));
  }

  private static final String getFilename(final String uri) {
    final int index = uri.lastIndexOf("/");
    return uri.substring(index + 1);
  }

  public Download() {
    super();
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Download download = (Download) o;
    return Objects.equals(uri, download.uri);
  }

  @Override
  public int hashCode() {

    return Objects.hash(uri);
  }
}
