/*
 * Copyright 2013-2019 Grzegorz Slowikowski (gslowikowski at gmail dot com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.google.code.play2.provider.api;

import java.io.File;
import java.net.URL;
import java.util.List;

public interface Play2EbeanEnhancer
{
    void setOutputDirectory( File outputDirectory );

    void setClassPathUrls( List<URL> classPathUrls ); /* change the name? */

    String getModelsToEnhance();

    boolean enhanceModel( File classFile )
        throws Exception;

}
