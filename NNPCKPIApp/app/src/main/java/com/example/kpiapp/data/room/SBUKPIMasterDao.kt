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

package com.nnpcgroup.kpiapp.data.room

import androidx.room.Dao
import androidx.room.Query
import com.nnpcgroup.kpiapp.data.Category
import com.nnpcgroup.kpiapp.data.SBUKPIMaster
import kotlinx.coroutines.flow.Flow

/**
 * [Room] DAO for [Category] related operations.
 */
@Dao
abstract class SBUKPIMasterDao : BaseDao<Category> {
    @Query("SELECT * FROM SBUKPIMaster")
    abstract suspend fun getCategoryWithName(): SBUKPIMaster?
}
