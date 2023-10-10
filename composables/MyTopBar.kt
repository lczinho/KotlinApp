package com.qi.finalproject.composables

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyTopBar(
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color(0xFFF36A00),
            titleContentColor = Color(0xFFFF0000)
        ),
        title = {
            Text(
                text = "GYM APP",
                fontWeight = FontWeight(900)
            )
        }
    )
}

/////////
@Preview
@Composable
fun previewMyTopBar() {
    MyTopBar()
}