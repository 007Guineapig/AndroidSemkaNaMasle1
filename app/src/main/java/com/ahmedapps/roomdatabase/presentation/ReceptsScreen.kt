package com.ahmedapps.roomdatabase.presentation

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ahmedapps.roomdatabase.R
import com.ahmedapps.roomdatabase.theme.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReceptsScreen(
    state: ReceptState,
    navController: NavController,
    onEvent: (ReceptsEvent) -> Unit
) {
    var text by remember { mutableStateOf("")}
    var active by remember { mutableStateOf(false)}
    var pomocna = ""
    var items = remember {
        mutableStateListOf<String>()

    }
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)){

            SearchBar(modifier=Modifier.fillMaxWidth(),
                query = text,
                onQueryChange = {
                    text = it
                },
                onSearch = {
                    items.add(text)
                    text = ""
                    active = false

                },
                active = active,
                onActiveChange = {active = it},
                placeholder = {
                    Text(text = "Search")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search,contentDescription = "Search Icon")},
                trailingIcon = {
                    if(active) {
                        Icon(
                            modifier = Modifier.clickable(){
                                if(text.isNotEmpty()){
                                    text = ""
                                } else{ active = false}

                            },
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close Icon"
                        )
                    }
                }

            ) {
                items.forEach {
                    Row(
                        modifier = Modifier
                            .padding(start = 14.dp)
                            .clickable(onClick = { text = it })
                    )
                    {
                        Icon(
                            Icons.Default.History,
                            contentDescription = "History Icon",
                            modifier = Modifier.padding(end = 10.dp)

                        )
                        Text(text = it)
                        pomocna = it
                    }
                }
            }




        LazyColumn(

            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            //for( n in state.receptiks)

            items(state.receptiks.size) { index ->
                if (pomocna.isEmpty() || state.receptiks[index].nazov.contains(pomocna)) {
                    ReceptItem(
                        state = state,
                        index = index,
                        onEvent = onEvent,
                        navController
                    )
                }

            }
        }

    }

}



@Composable
fun ReceptItem(
    state: ReceptState,
    index: Int,
    onEvent: (ReceptsEvent) -> Unit,
    navController:NavController
) {
    val ahoj = state.receptiks[index].nazov //stringResource(affirmation.stringResourceId)
    val ahoj3 = R.drawable.image11
    val ahoj4 = ahoj3.toString()
    val ahoj1: String = R.drawable.image11.toString()
    val ahoj2 = ("Composem ipsum color sit lazy, " +
            "padding theme elit, sed do bouncy. ").repeat(4)



    Card(

        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),

        modifier = Modifier
            .clickable(onClick = { navController.navigate(Screen.Recept1.rout + "/$ahoj/$ahoj4/$ahoj2") }) // Add clickable modifier here
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column{
            Image(
                painter = painterResource(R.drawable.image11),
                contentDescription = ahoj,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            CardContent(ahoj)

        }

    }
}

@Composable
private fun CardContent(name: String) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .padding(12.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(text = "Hello, ")
            Text(
                text = name, style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )
            if (expanded) {
                Text(
                    text = ("Composem ipsum color sit lazy, " +
                            "padding theme elit, sed do bouncy. ").repeat(4),
                )
            }
        }
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                contentDescription = if (expanded) {
                    stringResource(R.string.show_less)
                } else {
                    stringResource(R.string.show_more)
                }
            )
        }
    }
}










