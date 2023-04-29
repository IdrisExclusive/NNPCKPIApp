/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nnpcgroup.kpiapp.data

import androidx.compose.runtime.Immutable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "SBUKPIMaster",
    indices = [
        Index("Dashboard_ID", unique = true),
        Index("KPI_ID", unique = true),
        Index("SBU_Code", unique = true),
        Index("Year", unique = true)
    ]
)
@Immutable
data class SBUKPIMaster(
    @PrimaryKey @ColumnInfo(name = "Dashboard_ID") val dashboardID: Int = 0,
    @PrimaryKey @ColumnInfo(name = "KPI_ID") val kpiID: Int = 0,
    @PrimaryKey @ColumnInfo(name = "SBU_Code") val sbuCode: String,
    @PrimaryKey @ColumnInfo(name = "Year") val year: Int = 2020,
    @ColumnInfo(name = "KPI_Description") val name: String,
    @ColumnInfo(name = "KPI_Sno") val kpiSno: Int,
    @ColumnInfo(name = "Plan") val plan: Long,
    @ColumnInfo(name = "Plan_Weight") val planWeight: Float,
    @ColumnInfo(name = "Key_Result_ID") val keyResultID: Int,
    @ColumnInfo(name = "Roll_Up_Flag") val rollUpFlag: Boolean,
    @ColumnInfo(name = "Frequency") val frequency: String,
    @ColumnInfo(name = "Frequency_Text") val frequencyText: String
)
