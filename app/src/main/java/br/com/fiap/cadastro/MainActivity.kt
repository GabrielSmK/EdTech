package br.com.fiap.cadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.cadastro.ui.theme.CadastroTheme
import br.com.fiap.cadastro.ui.theme.Inter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    var texto by remember {

        mutableStateOf("")

    }

    var RG by remember {

        mutableStateOf("")

    }

    var email by remember {

        mutableStateOf("")

    }

    var senha by remember {

        mutableStateOf("")

    }

    var data by remember {

        mutableStateOf("")

    }

    Column(modifier = Modifier.padding(32.dp)) {

        Text(text = "Cadastre-se",
            textAlign = TextAlign.Center,
            fontSize = 48.sp,
            fontFamily = Inter
            )

        Spacer(modifier = Modifier.height(32.dp))
        OutlinedTextField(
            value = texto,
            onValueChange = { letra ->
                texto = letra
            },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Qual o seu nome?")
            },
            placeholder = {
                Text(text = "Digite seu nome completo")
            },
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.person_24), contentDescription = "ícone de pessoa")
            },
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words),
            colors = TextFieldDefaults.colors(unfocusedTextColor = Color.Gray),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = data,
            onValueChange = { letra ->
                data = letra
            },
            modifier = Modifier.fillMaxWidth()
                .padding(top = 32.dp),
            label = {
                Text(text = "Qual a sua data de nascimento?")
            },
            placeholder = {
                Text(text = "Digite sua data de nascimento")
            },
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.calendar_24), contentDescription = "ícone de calendário")
            },
            //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            colors = TextFieldDefaults.colors(unfocusedTextColor = Color.Gray),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = RG,
            onValueChange = { letra ->
                RG = letra
            },
            modifier = Modifier.fillMaxWidth()
                .padding(top = 32.dp),
            label = {
                Text(text = "Qual o seu RG?")
            },
            placeholder = {
                Text(text = "Digite seu RG")
            },
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.rg_24), contentDescription = "ícone de RG")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.colors(unfocusedTextColor = Color.Gray),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = email,
            onValueChange = { letra ->
                email = letra
            },
            modifier = Modifier.fillMaxWidth()
                .padding(top = 32.dp),
            label = {
                Text(text = "Qual o seu e-mail?")
            },
            placeholder = {
                Text(text = "Digite seu e-mail")
            },
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.mail_24), contentDescription = "ícone de email")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = TextFieldDefaults.colors(unfocusedTextColor = Color.Gray),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = senha,
            onValueChange = { letra ->
                senha = letra
            },
            modifier = Modifier.fillMaxWidth()
                .padding(top = 32.dp),
            label = {
                Text(text = "Escolha uma senha")
            },
            placeholder = {
                Text(text = "Digite uma senha")
            },
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.password_24), contentDescription = "ícone de senha")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(unfocusedTextColor = Color.Gray),
            shape = RoundedCornerShape(10.dp),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(32.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(width = 250.dp, height = 48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                )
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CadastroTheme {
        Greeting()
    }
}