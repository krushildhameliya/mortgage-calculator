/************************************************
 * Created by Ruslan Khvastunov                 *
 * r.khvastunov@gmail.com                       *
 * Copyright (c) 2022                           *
 * All rights reserved.                         *
 *                                              *
 ************************************************/

package com.phase1Assignment.loancalculator.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.intl.Locale


/**Method is used to correctly display text in Russian.
 * Until dimensionResource(id = ) starts to provide sp,
 * this method will be used.
 * */
@Composable
@ReadOnlyComposable
fun isRuCurrLocale(): Boolean{
    val locale = Locale.current
    return locale.language == "ru"
}