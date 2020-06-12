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
import com.google.devtools.build.lib.cmdline.Label;
import com.google.devtools.build.lib.collect.nestedset.Depset;
import com.google.devtools.build.lib.rules.android.ParsedAndroidAssets;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidAssetsInfoApi;
import com.google.devtools.build.lib.syntax.EvalException;

public class FakeAndroidAssetsInfoProvider implements AndroidAssetsInfoApi.Provider<Artifact, ParsedAndroidAssets> {
  @Override
  public AndroidAssetsInfoApi<Artifact, ParsedAndroidAssets> createInfo(Label label, Object validationResult,
                                                                        Depset directParsedAssets,
                                                                        Depset transitiveParsedAssets,
                                                                        Depset transitiveAssets,
                                                                        Depset transitiveSymbols,
                                                                        Depset transitiveCompiledSymbols) throws EvalException {
    return null;
  }
}
