package com.walterjwhite.download.api.model;

import com.walterjwhite.datastore.api.model.entity.AbstractEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.*;

@Data
@ToString(doNotUseGetters = true)
@AllArgsConstructor
@NoArgsConstructor
// @PersistenceCapable
@Entity
public class Download extends AbstractEntity {
  @Column protected String uri;
  @EqualsAndHashCode.Exclude @Column protected String signature;
  @EqualsAndHashCode.Exclude @Column protected String filename;

  public Download(String uri, String signature) {
    this(uri, signature, getFilename(uri));
  }

  public Download(String uri) {
    this(uri, null);
  }

  private static final String getFilename(final String uri) {
    final int index = uri.lastIndexOf("/");
    return uri.substring(index + 1);
  }
}
