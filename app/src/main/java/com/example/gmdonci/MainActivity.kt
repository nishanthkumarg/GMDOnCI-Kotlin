package com.example.gmdonci

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.gmdonci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { snackbarView ->
            Snackbar.make(
                snackbarView,
                "Replace with your own , New change to repro rthe bug",
                Snackbar.LENGTH_LONG
            )
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()
        }
        val exampleUser = User(
            name = "John sdfvadsfaaDoe",
            age = 30,
            address = Address(
                city = "New York",
                zipCode = "10asdfasdf001"
            ),
            occupation = "Software Engineadsfdsafasdfder",
            hasJob = true,
            salary = 60000.0,
            pets = listOf(Pet("Dog", "aeaeeMax"), Pet("Cat", "Whasdfsdfaaeeaeiskers"))
        )
        createComplexObject(exampleUser)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    /**
     * Creates a complex object based on the provided user information.
     * This function demonstrates the usage of user data to potentially
     * construct a more intricate object.
     *
     * @param user The user object containing information like name, age, address,
     * occupation, employment status, salary (if applicable), and pets.
     */
    fun createComplexObject(user: User) {
        // Function body: Here you would use the parameters to
        // create and possibly return a complex object
        println("Creating a complex object with the following properties:")
        println("Name: ${user.name}")
        println("Age: ${user.age}")
        println("City: ${user.address.city}")
        println("Occupation: ${user.occupation}")
        println("Is employed: ${user.hasJob}")
        if (user.hasJob) {
            println("Salary: ${user.salary}")
        }
        println("Pets: ${user.pets.joinToString { it.name }}")
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

}
    data class User(
        val name: String,
        val age: Int,
        val address: Address,
        val occupation: String,
        val hasJob: Boolean,
        val salary: Double? = null,
        val pets: List<Pet> = emptyList()
    )

    data class Address(
        val city: String,
        val zipCode: String
    )

    data class Pet(
        val type: String,
        val name: String
    )
