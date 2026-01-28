package com.example.dreamteamapp.bios

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dreamteamapp.R

@Composable
fun BioStudent3Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.student3),
            contentDescription = "Student 3 Photo",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Frenz Dave Dacillo",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "I'm Frenz Dave B. Dacillo, currently a 3rd year BSIT student, 21 years old. Learning Java, PHP, HTML, JavaScript, and more.",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}