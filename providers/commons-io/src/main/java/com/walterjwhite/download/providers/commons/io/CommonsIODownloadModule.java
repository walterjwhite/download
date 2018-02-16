package com.walterjwhite.download.providers.commons.io;

import com.google.inject.AbstractModule;
import com.walterjwhite.download.api.service.DownloadService;

public class CommonsIODownloadModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(DownloadService.class).to(CommonsIODownloadService.class);
  }
}
