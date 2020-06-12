// Copyright 2020 The Bazel Authors. All rights reserved.
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

package com.google.devtools.build.skydoc.fakebuildapi.android;

import com.google.devtools.build.lib.actions.Artifact;
import com.google.devtools.build.lib.actions.Artifact.SpecialArtifact;
import com.google.devtools.build.lib.analysis.ConfiguredTarget;
import com.google.devtools.build.lib.analysis.starlark.StarlarkRuleContext;
import com.google.devtools.build.lib.rules.android.AndroidAssetsInfo;
import com.google.devtools.build.lib.rules.android.AndroidBinaryDataInfo;
import com.google.devtools.build.lib.rules.android.AndroidDataContext;
import com.google.devtools.build.lib.rules.android.AndroidLibraryAarInfo;
import com.google.devtools.build.lib.rules.android.AndroidManifestInfo;
import com.google.devtools.build.lib.rules.android.AndroidResourcesInfo;
import com.google.devtools.build.lib.rules.android.ValidatedAndroidResources;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidBinaryDataSettingsApi;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidDataProcessingApi;
import com.google.devtools.build.lib.skylarkbuildapi.core.ProviderApi;
import com.google.devtools.build.lib.skylarkbuildapi.core.StructApi;
import com.google.devtools.build.lib.syntax.Dict;
import com.google.devtools.build.lib.syntax.EvalException;
import com.google.devtools.build.lib.syntax.Sequence;
import com.google.devtools.build.lib.syntax.StarlarkThread;

public class FakeAndroidStarlarkData implements AndroidDataProcessingApi<
    AndroidDataContext,
    ConfiguredTarget,
    Artifact,
    SpecialArtifact,
    AndroidAssetsInfo,
    AndroidResourcesInfo,
    AndroidManifestInfo,
    AndroidLibraryAarInfo,
    AndroidBinaryDataInfo,
    ValidatedAndroidResources,
        StarlarkRuleContext> {

  @Override
  public AndroidDataContext makeContext(StarlarkRuleContext ctx)
      throws EvalException, InterruptedException {
    return null;
  }

  @Override
  public AndroidAssetsInfo assetsFromDeps(Sequence<?> deps, boolean neverlink,
      StarlarkThread thread) throws EvalException {
    return null;
  }

  @Override
  public AndroidResourcesInfo resourcesFromDeps(AndroidDataContext ctx, Sequence<?> deps,
      Sequence<?> assets, boolean neverlink, String customPackage)
      throws InterruptedException, EvalException {
    return null;
  }

  @Override
  public AndroidManifestInfo stampAndroidManifest(AndroidDataContext ctx, Object manifest,
      Object customPackage, boolean exported) throws InterruptedException, EvalException {
    return null;
  }

  @Override
  public AndroidAssetsInfo mergeAssets(AndroidDataContext ctx, Object assets, Object assetsDir,
      Sequence<?> deps, boolean neverlink) throws EvalException, InterruptedException {
    return null;
  }

  @Override
  public ValidatedAndroidResources mergeRes(AndroidDataContext ctx, AndroidManifestInfo manifest,
      Sequence<?> resources, Sequence<?> deps, boolean neverlink, boolean enableDataBinding)
      throws EvalException, InterruptedException {
    return null;
  }

  @Override
  public Dict<? extends ProviderApi, ? extends StructApi> mergeResources(AndroidDataContext ctx,
      AndroidManifestInfo manifest, Sequence<?> resources, Sequence<?> deps, boolean neverlink,
      boolean enableDataBinding) throws EvalException, InterruptedException {
    return null;
  }

  @Override
  public AndroidLibraryAarInfo makeAar(AndroidDataContext ctx, AndroidResourcesInfo resourcesInfo,
      AndroidAssetsInfo assetsInfo, Artifact libraryClassJar, Sequence<?> localProguardSpecs,
      Sequence<?> deps, boolean neverlink) throws EvalException, InterruptedException {
    return null;
  }

  @Override
  public Dict<? extends ProviderApi, ? extends StructApi> processAarImportData(
      AndroidDataContext ctx, SpecialArtifact resources, SpecialArtifact assets,
      Artifact androidManifest, Sequence<?> deps) throws InterruptedException, EvalException {
    return null;
  }

  @Override
  public Dict<? extends ProviderApi, ? extends StructApi> processLocalTestData(AndroidDataContext ctx,
      Object manifest, Sequence<?> resources, Object assets, Object assetsDir, Object customPackage,
      String aaptVersionString, Dict<?, ?> manifestValues, Sequence<?> deps, Sequence<?> noCompressExtensions,
      Sequence<?> resourceConfigurationFilters, Sequence<?> densities) throws InterruptedException, EvalException {
    return null;
  }


  @Override
  public AndroidBinaryDataSettingsApi makeBinarySettings(AndroidDataContext ctx,
      Object shrinkResources, Sequence<?> resourceConfigurationFilters, Sequence<?> densities,
      Sequence<?> noCompressExtensions) throws EvalException {
    return null;
  }

  @Override
  public AndroidBinaryDataInfo processBinaryData(AndroidDataContext ctx, Sequence<?> resources,
      Object assets, Object assetsDir, Object manifest, Object customPackage,
      Dict<?, ?> manifestValues, Sequence<?> deps, String manifestMerger, Object maybeSettings,
      boolean crunchPng, boolean dataBindingEnabled) throws InterruptedException, EvalException {
    return null;
  }

  @Override
  public AndroidBinaryDataInfo shrinkDataApk(AndroidDataContext ctx,
      AndroidBinaryDataInfo binaryDataInfo, Artifact proguardOutputJar, Artifact proguardMapping,
      Object maybeSettings, Sequence<?> deps, Sequence<?> localProguardSpecs,
      Sequence<?> extraProguardSpecs) throws EvalException, InterruptedException {
    return null;
  }

  @Override
  public Artifact resourcesFromValidatedRes(ValidatedAndroidResources resources) {
    return null;
  }
}
