// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.skylarkbuildapi.android;

import com.google.common.collect.ImmutableMap;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidApplicationResourceInfoApi.AndroidApplicationResourceInfoApiProvider;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidDeviceBrokerInfoApi.AndroidDeviceBrokerInfoApiProvider;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidInstrumentationInfoApi.AndroidInstrumentationInfoApiProvider;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidNativeLibsInfoApi.AndroidNativeLibsInfoApiProvider;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidResourcesInfoApi.AndroidResourcesInfoApiProvider;
import com.google.devtools.build.lib.skylarkbuildapi.android.ApkInfoApi.ApkInfoApiProvider;
import com.google.devtools.build.lib.skylarkbuildapi.core.Bootstrap;
import com.google.devtools.build.lib.skylarkbuildapi.core.ProviderApi;
import com.google.devtools.build.lib.syntax.FlagGuardedValue;
import com.google.devtools.build.lib.syntax.StarlarkSemantics.FlagIdentifier;

/** {@link Bootstrap} for Starlark objects related to Android rules. */
public class AndroidBootstrap implements Bootstrap {

  private final AndroidStarlarkCommonApi<?, ?> androidCommon;
  private final AndroidDataProcessingApi androidData;
  private final AndroidSdkProviderApi.Provider androidSdkInfoProvider;
  private final ApkInfoApiProvider apkInfoProvider;
  private final AndroidInstrumentationInfoApiProvider<?> androidInstrumentationInfoProvider;
  private final AndroidDeviceBrokerInfoApiProvider androidDeviceBrokerInfoProvider;
  private final AndroidResourcesInfoApi.AndroidResourcesInfoApiProvider<?, ?, ?>
      androidResourcesInfoProvider;
  private final AndroidAssetsInfoApi.Provider androidAssetsInfoApiProvider;
  private final AndroidLibraryResourceClassJarProviderApi.Provider androidLibraryResourceClassJarProviderApi;
  private final AndroidNativeLibsInfoApiProvider androidNativeLibsInfoProvider;
  private final AndroidApplicationResourceInfoApiProvider<?>
      androidApplicationResourceInfoApiProvider;
  private final ProviderApi androidBinaryDataInfoApiProvider;

  public AndroidBootstrap(
      AndroidStarlarkCommonApi<?, ?> androidCommon,
      AndroidDataProcessingApi androidData,
      AndroidSdkProviderApi.Provider androidSdkInfoProvider,
      ApkInfoApiProvider apkInfoProvider,
      AndroidInstrumentationInfoApiProvider<?> androidInstrumentationInfoProvider,
      AndroidDeviceBrokerInfoApiProvider androidDeviceBrokerInfoProvider,
      AndroidResourcesInfoApiProvider<?, ?, ?> androidResourcesInfoProvider,
      AndroidAssetsInfoApi.Provider androidAssetsInfoApiProvider,
      AndroidLibraryResourceClassJarProviderApi.Provider androidLibraryResourceClassJarProviderApi,
      AndroidNativeLibsInfoApiProvider androidNativeLibsInfoProvider,
      AndroidApplicationResourceInfoApiProvider<?> androidApplicationResourceInfoApiProvider,
      ProviderApi androidBinaryDataInfoApiProvider) {
    this.androidCommon = androidCommon;
    this.androidData = androidData;
    this.androidSdkInfoProvider = androidSdkInfoProvider;
    this.apkInfoProvider = apkInfoProvider;
    this.androidInstrumentationInfoProvider = androidInstrumentationInfoProvider;
    this.androidDeviceBrokerInfoProvider = androidDeviceBrokerInfoProvider;
    this.androidResourcesInfoProvider = androidResourcesInfoProvider;
    this.androidAssetsInfoApiProvider = androidAssetsInfoApiProvider;
    this.androidLibraryResourceClassJarProviderApi = androidLibraryResourceClassJarProviderApi;
    this.androidNativeLibsInfoProvider = androidNativeLibsInfoProvider;
    this.androidApplicationResourceInfoApiProvider = androidApplicationResourceInfoApiProvider;
    this.androidBinaryDataInfoApiProvider = androidBinaryDataInfoApiProvider;
  }

  @Override
  public void addBindingsToBuilder(ImmutableMap.Builder<String, Object> builder) {
    // TODO: Make an incompatible change flag to hide android_common behind
    // --experimental_google_legacy_api.
    // Rationale: android_common module contains commonly used functions used outside of
    // the Android Starlark migration. Let's not break them without an incompatible
    // change process.
    builder.put("android_common", androidCommon);
    builder.put("android_data", androidData);

    builder.put(
        AndroidSdkProviderApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, androidSdkInfoProvider));
    builder.put(
        ApkInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, apkInfoProvider));
    builder.put(
        AndroidInstrumentationInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, androidInstrumentationInfoProvider));
    builder.put(
        AndroidDeviceBrokerInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, androidDeviceBrokerInfoProvider));
    builder.put(
        AndroidResourcesInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, androidResourcesInfoProvider));
    builder.put(
        AndroidAssetsInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, androidAssetsInfoApiProvider));
    builder.put(
        AndroidLibraryResourceClassJarProviderApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, androidLibraryResourceClassJarProviderApi));
    builder.put(
        AndroidNativeLibsInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API, androidNativeLibsInfoProvider));
    builder.put(
        AndroidApplicationResourceInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API,
            androidApplicationResourceInfoApiProvider));
    builder.put(
        AndroidBinaryDataInfoApi.NAME,
        FlagGuardedValue.onlyWhenExperimentalFlagIsTrue(
            FlagIdentifier.EXPERIMENTAL_GOOGLE_LEGACY_API,
            androidBinaryDataInfoApiProvider));
  }
}
