package com.qi.finalproject.composables

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qi.finalproject.R

@Composable
fun MyGrid(
    modifier: Modifier = Modifier,
    list: List<Treinos> = listTraining
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        content = {
            items(list) {
                MyCardState(
                    img = it.image,
                    txt = it.training
                )
            }
        }
    )
}

///////////////
@Preview
@Composable
fun GridPreview() {
    MyGrid()
}


data class Treinos(
    var training: String,
    var image: Int
)

var listTraining = listOf<Treinos>(
    Treinos("Segunda", R.drawable.treino1),
    Treinos("Terça", R.drawable.treino2),
    Treinos("Quarta", R.drawable.treino3),
    Treinos("Quinta", R.drawable.treino4),
)