/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.ark.config.util;

import com.alipay.sofa.ark.common.util.StringUtils;
import com.alipay.sofa.ark.exception.ArkRuntimeException;

import java.net.InetAddress;

/**
 * @author qilong.zql
 * @since 0.6.0
 */
public class NetUtils {
    private static String localhost;

    public static String getLocalHostAddress() {
        try {
            if (StringUtils.isEmpty(localhost)) {
                localhost = InetAddress.getLocalHost().getHostAddress();
            }
            return localhost;
        } catch (Throwable throwable) {
            throw new ArkRuntimeException(throwable);
        }
    }
}