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
import com.google.devtools.build.lib.analysis.FilesToRunProvider;
import com.google.devtools.build.lib.analysis.TransitiveInfoCollection;
import com.google.devtools.build.lib.skylarkbuildapi.android.AndroidSdkProviderApi;
import com.google.devtools.build.lib.syntax.EvalException;

public class FakeAndroidSdkProvider
        implements AndroidSdkProviderApi.Provider<
        Artifact, FilesToRunProvider, TransitiveInfoCollection> {

    @Override
    public AndroidSdkProviderApi<Artifact, FilesToRunProvider, TransitiveInfoCollection> createInfo(
            String buildToolsVersion, Artifact frameworkAidl, Object aidlLib, Artifact androidJar,
            Object sourceProperties, Artifact shrinkedAndroidJar, Artifact mainDexClasses,
            FilesToRunProvider adb, FilesToRunProvider dx, FilesToRunProvider mainDexListCreator,
            FilesToRunProvider aidl,FilesToRunProvider aapt, FilesToRunProvider aapt2, Object apkBuilder,
            FilesToRunProvider apkSigner, FilesToRunProvider proguard, FilesToRunProvider zipalign,
            Object system) throws EvalException {
        return null;
    }
}
