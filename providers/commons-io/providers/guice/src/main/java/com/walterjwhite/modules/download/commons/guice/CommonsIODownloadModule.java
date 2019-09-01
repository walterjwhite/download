package com.walterjwhite.modules.download.commons.guice;

import com.google.inject.AbstractModule;
import com.walterjwhite.download.api.service.DownloadService;
import com.walterjwhite.download.providers.commons.io.CommonsIODownloadService;

public class CommonsIODownloadModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(DownloadService.class).to(CommonsIODownloadService.class);
  }
}
