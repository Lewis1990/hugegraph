/*
 * Copyright 2017 HugeGraph Authors
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.baidu.hugegraph.sofarpc;

import java.util.Map;

import com.alipay.sofa.rpc.common.RpcConfigs;
import com.baidu.hugegraph.config.HugeConfig;
import com.baidu.hugegraph.config.ServerOptions;

public class RpcCommonConfig {

    public static void initRpcConfigs(HugeConfig conf) {
        RpcConfigs.putValue("rpc.config.order",
                            conf.get(ServerOptions.RPC_CONFIG_ORDER));
        RpcConfigs.putValue("logger.impl",
                            conf.get(ServerOptions.RPC_LOGGER_IMPL));
    }

    public static void initRpcConfigs(String key, Object value) {
        RpcConfigs.putValue(key, value);
    }

    public static void initRpcConfigs(Map<String, Object> conf) {
        for(Map.Entry<String, Object> entry : conf.entrySet()) {
            RpcConfigs.putValue(entry.getKey(), entry.getValue());
        }
    }
}
