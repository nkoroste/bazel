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
package com.google.devtools.build.skydoc.fakebuildapi.android;

import com.google.devtools.build.lib.packages.Provider;
import com.google.devtools.build.lib.skylarkbuildapi.FileApi;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidBinaryDataInfoApi;
import com.google.devtools.build.lib.syntax.EvalException;
import com.google.devtools.build.lib.syntax.Location;

/**
 * Fake implementation of {@link AndroidBinaryDataInfoApi}.
 */
public class FakeAndroidBinaryData implements AndroidBinaryDataInfoApi<FileApi>, Provider {

  @Override
  public FileApi getApk() {
    return null;
  }

  @Override
  public FileApi getFinalRClassJar() {
    return null;
  }

  @Override
  public FileApi getResourceProguardConfig() {
    return null;
  }

  @Override
  public String toProto() throws EvalException {
    return "";
  }

  @Override
  public String toJson() throws EvalException {
    return "";
  }

  @Override
  public boolean isExported() {
    return false;
  }

  @Override
  public Key getKey() {
    return null;
  }

  @Override
  public String getPrintableName() {
    return null;
  }

  @Override
  public Location getLocation() {
    return null;
  }
}
