package com.qi.finalproject.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.qi.finalproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCard(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
    text: String,
    check: Boolean,
    onCheck: (Boolean) -> Unit
) {
    Card(
        modifier = modifier.padding(5.dp),
        content = {
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = modifier.padding(5.dp)
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = modifier.fillMaxWidth()
                )
                Column(
                    modifier = modifier.padding(bottom = 5.dp)
                ) {

                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = text,
                            fontSize = 26.sp
                        )
                        Switch(
                            checked = check,
                            onCheckedChange = onCheck
                        )
                    } //Row
                } //Column
            }  //Box
        }
    )


}

@Composable
fun MyCardState(
    modifier: Modifier = Modifier,
    @DrawableRes img: Int = R.drawable.treino1,
    txt: String = "Treino"
) {
    var check by rememberSaveable {
        mutableStateOf(false)
    }

    MyCard(
        image = img,
        text = txt,
        check = check,
        onCheck = { newValue -> check = newValue }
    )


}





////////////////////////
@Preview
@Composable
fun CardPreview() {
    MyCardState()
}