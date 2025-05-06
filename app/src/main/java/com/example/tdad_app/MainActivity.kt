package com.example.tdad_app


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tdad_app.thirty_days_data.Entries
import com.example.tdad_app.ui.theme.TDADAppTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TDADAppTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = " 30 Days of Android App development",
                                    style = MaterialTheme.typography.titleLarge,
                                    color = MaterialTheme.colorScheme.onPrimary
                                )
                            },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.8f) // Adjust alpha for transparency
                            )
                        )
                    }
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        var isDarkTheme = isSystemInDarkTheme()
                        var backgroundImage = painterResource(R.drawable.bg)
                        if(isDarkTheme){
                            backgroundImage= painterResource(R.drawable.bg_dark)
                        }
                        Image(
                            painter = backgroundImage,
                            contentDescription = "Background Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )

                        DayCards(modifier = Modifier.padding(it))
                    }
                }

            }
        }
    }
}

@Composable
fun DayCards(modifier: Modifier = Modifier) {

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(Entries){ entry ->
            var visible by remember {
                mutableStateOf(false)
            }

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    visible=!visible
                }
            ) {

                Text(
                    text = stringResource( entry.dayNumber),
                    modifier=Modifier.padding(
                        start=16.dp,
                        end=16.dp,
                        bottom=2.dp,
                        top=16.dp)
                )


                Text(
                    text = stringResource(entry.dayTitle),
                    style = MaterialTheme.typography.labelLarge,
                    modifier=Modifier.padding(start=16.dp,end=16.dp,bottom=2.dp),
                    textAlign = TextAlign.Justify
                )
                Image(
                    painter= painterResource(entry.imageCode),
                    contentDescription = stringResource(entry.dayTitle),
                    contentScale = ContentScale.Crop,
                    modifier=Modifier.padding(start=16.dp,end=16.dp,bottom=16.dp).fillMaxWidth().height(250.dp)
                )
                AnimatedVisibility(visible) {
                    Text(
                        text = stringResource(entry.description),
                        modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
                    )
                }

            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LightModePreview() {
    TDADAppTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "30 Days of Android App development",
                            style = MaterialTheme.typography.titleLarge,
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.8f) // Adjust alpha for transparency
                    )
                )
            }
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(R.drawable.bg),
                    contentDescription = "Background Image",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier.matchParentSize()
                )

                DayCards(modifier = Modifier.padding(it))
            }
        }

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DarkModePreview() {
    TDADAppTheme(darkTheme = true) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "30 Days of Android App development",
                            style = MaterialTheme.typography.titleLarge,
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.8f) // Adjust alpha for transparency
                    )
                )
            }
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(R.drawable.bg_dark),
                    contentDescription = "Background Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.matchParentSize()
                )

                DayCards(modifier = Modifier.padding(it))
            }
        }

    }
}
