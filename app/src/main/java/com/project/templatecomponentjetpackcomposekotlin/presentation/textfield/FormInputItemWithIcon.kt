package com.project.templatecomponentjetpackcomposekotlin.presentation.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.templatecomponentjetpackcomposekotlin.R
import com.project.templatecomponentjetpackcomposekotlin.ui.theme.poppinsFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputItemWithIcon(
    title: String,
    value: String,
    onValueChange: (String) -> Unit,
    placeable: String,
    keyboardType: KeyboardType
) {
    Column(
        modifier = Modifier
    ) {
        Text(
            text = title,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            color = Color.White
        )
        TextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = {
               Row(
                   modifier = Modifier.fillMaxWidth()
               ) {
                   Icon(
                       painter = painterResource(id = R.drawable.ic_kalender),
                       contentDescription = "Search",
                       tint = Color.Gray
                   )
                   Spacer(modifier = Modifier.width(8.dp))
                   Text(
                       text = placeable,
                       fontSize = 12.sp,
                       fontFamily = poppinsFontFamily,
                       fontWeight = FontWeight.Normal,
                       color = Color.Gray
                   )
               }
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = keyboardType
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(0.dp),
            singleLine = true
        )
    }
}

@Composable
fun FormInputItemWithIconContent(
    modifier: Modifier = Modifier,
    onInputChange: (String) -> Unit
) {
    var input by remember {
        mutableStateOf("")
    }
    FormInputItemWithIcon(
        title = "Title",
        value = input,
        onValueChange = onInputChange,
        placeable = "Placeable",
        keyboardType = KeyboardType.Text
    )
}

@Preview
@Composable
private fun FormInputWithIconPrev() {
    FormInputItemWithIconContent {}
}