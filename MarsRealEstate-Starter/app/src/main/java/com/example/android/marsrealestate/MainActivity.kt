/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.example.android.marsrealestate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//29 09 2021
//https://developer.android.com/codelabs/kotlin-android-training-internet-data?index=..%2F..android-kotlin-fundamentals#4

// https://codelabs.developers.google.com/codelabs/serverless-web-apis#0

// https://codelabs.developers.google.com/codelabs/cloud-springboot-kubernetes#0
// https://docs.openexchangerates.org/docs/api-introduction


class MainActivity : AppCompatActivity() {

    /**
     * Our MainActivity is only responsible for setting the content view that contains the
     * Navigation Host.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
