package com.example.pruebaandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.* // Para las filas y columnas
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pruebaandroid.ui.theme.PruebaAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaAndroidTheme() {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher),
                contentDescription = "Profile Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Sebastian Ignacio Acuña Valderrama",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Prueba Android",
                fontSize = 16.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(16.dp))
            ContactInfo()
        }
    }
}

@Composable
fun ContactInfo() {
    Column {
        Row(modifier = Modifier.padding(8.dp)) {
            Icon(
                painter = painterResource(R.drawable.phone_image), // Reemplaza con tu ícono de teléfono
                contentDescription = "Phone Icon",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+56 9 1172 8237 ")
        }
        Row(modifier = Modifier.padding(8.dp)) {
            Icon(
                painter = painterResource(R.drawable.social_image), // Reemplaza con tu ícono de red social
                contentDescription = "Social Media Icon",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "@sbaa.skajska")
        }
        Row(modifier = Modifier.padding(8.dp)) {
            Icon(
                painter = painterResource(R.drawable.mail_image), // Reemplaza con tu ícono de correo
                contentDescription = "Email Icon",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "s.acuna30@alumnos.santotomas.cl")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PruebaAndroidTheme() {
        BusinessCard()
    }
}
