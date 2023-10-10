package com.qi.finalproject.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.qi.finalproject.composables.MyGrid
import com.qi.finalproject.composables.MyTopBar
import com.qi.projectt.composables.MyBottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyHome(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = { MyTopBar() },
        bottomBar = { MyBottomBar() },
        content = {
            Column(modifier = modifier.padding(it)) {
                MyGrid()
            }
        }
    )


}


@Preview
@Composable
fun PreviewMyHome() {
    MyHome()
}