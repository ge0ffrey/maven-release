package org.apache.maven.shared.release.versions;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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

/**
 * @todo this has an overlap with ArtifactVersion in maven-artifact - would be good to migrate this there.
 */
public interface VersionInfo
    extends Comparable<VersionInfo>
{

    /**
     * Returns a string representing the version with a snapshot specification
     *
     * @return
     */
    String getSnapshotVersionString();

    /**
     * Returns a string representing the version without a snapshot specification.
     *
     * @return
     */
    String getReleaseVersionString();

    /**
     * Returns a {@link VersionInfo} object which represents the next version of this object.
     *
     * @return
     */
    VersionInfo getNextVersion();

    /**
     * Returns whether this represents a snapshot version.
     *
     * @return
     */
    boolean isSnapshot();
}
