package com.raywenderlich.android.lab1.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun ColumnScreen(){
    MyColumn()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyColumn(){
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier.fillMaxSize()){

        THREE_ELEMENT_LIST(listOf(R.string.text1, R.string.text2, R.string.text3)) { textResId ->
            Text(
                text = stringResource(id = textResId),
                fontSize = 22.sp
            )
        }

    }
}

@Composable
fun THREE_ELEMENT_LIST(elements: List<Int>, content: @Composable (textResId: Int) -> Unit) {
    elements.forEach { textResId ->
        content(textResId)
    }
}
