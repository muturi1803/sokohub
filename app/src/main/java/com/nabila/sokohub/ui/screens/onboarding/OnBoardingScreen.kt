package com.nabila.sokohub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nabila.sokohub.R
import com.nabila.sokohub.navigation.ROUT_HOME
import com.nabila.sokohub.navigation.ROUT_REGISTER
import com.nabila.sokohub.ui.theme.newpurple

@Composable
fun OnBoardingScreen( navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(100.dp)
        )


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome to SokoHub!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = newpurple

        )

        Text(
            text = "Shop Smarter,",
            fontSize = 20.sp
        )

        Text(
            text ="Everywhere you go",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Create stunning ecommerce apps with ecommerce mobile app design templates. Find customizable designs to enhance your app's user experience.",
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )

        Button(
            onClick = { navController.navigate(ROUT_REGISTER)},
            colors = ButtonDefaults.buttonColors(newpurple),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "Get Started")

        }



    }






















}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview(){

    OnBoardingScreen(rememberNavController())
}
