package com.raywenderlich.android.lab1.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import androidx.compose.ui.Modifier

@Composable
fun BoxScreen() {
    MyBox()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyBox(
    modifier: Modifier = Modifier,
    contentModifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.text1),
            fontSize = 22.sp,
            modifier = contentModifier.then(Modifier.align(Alignment.TopStart))
        )
        Text(
            text = stringResource(id = R.string.text2),
            fontSize = 22.sp,
            modifier = contentModifier.then(Modifier.align(Alignment.Center))
        )
        Text(
            text = stringResource(id = R.string.text3),
            fontSize = 22.sp,
            modifier = contentModifier.then(Modifier.align(Alignment.BottomEnd))
        )
    }
}
