/*
 * Copyright (C) 2018-present, Chenai Nakam(chenai.nakam@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bitcoinj.core;

import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.RegTestParams;
import org.bitcoinj.params.TestNet3Params;
import org.bitcoinj.params.UnitTestParams;

import javax.annotation.Nullable;

/**
 * @author Chenai Nakam(chenai.nakam@gmail.com)
 * @version 1.0, 23/04/2018
 */
public class NetWorkRecognizer {
    /**
     * Returns the network parameters for the given string ID or NULL if not recognized.
     */
    @Nullable
    public NetworkParameters fromID(String id) {
        if (id.equals(NetworkParameters.ID_MAINNET)) {
            return MainNetParams.get();
        } else if (id.equals(NetworkParameters.ID_TESTNET)) {
            return TestNet3Params.get();
        } else if (id.equals(NetworkParameters.ID_UNITTESTNET)) {
            return UnitTestParams.get();
        } else if (id.equals(NetworkParameters.ID_REGTEST)) {
            return RegTestParams.get();
        } else {
            return null;
        }
    }

    /**
     * Returns the network parameters for the given string paymentProtocolID or NULL if not recognized.
     */
    @Nullable
    public NetworkParameters fromPmtProtocolID(String pmtProtocolId) {
        if (pmtProtocolId.equals(NetworkParameters.PAYMENT_PROTOCOL_ID_MAINNET)) {
            return MainNetParams.get();
        } else if (pmtProtocolId.equals(NetworkParameters.PAYMENT_PROTOCOL_ID_TESTNET)) {
            return TestNet3Params.get();
        } else if (pmtProtocolId.equals(NetworkParameters.PAYMENT_PROTOCOL_ID_UNIT_TESTS)) {
            return UnitTestParams.get();
        } else if (pmtProtocolId.equals(NetworkParameters.PAYMENT_PROTOCOL_ID_REGTEST)) {
            return RegTestParams.get();
        } else {
            return null;
        }
    }
}
