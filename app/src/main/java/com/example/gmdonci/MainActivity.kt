package com.example.gmdonci

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.gmdonci.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    /**
     * This property is only valid between onCreateView and
     */

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

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own , New change to repro rthe bug", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()
        }
        createComplexObject("John Doe", 30, "New York", "Software Engineer", true, 50000.0, true, 2, "Blue", "Pizza")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    fun createComplexObject(
        name: String,
        age: Int,
        city: String,
        occupation: String,
        isEmployed: Boolean,
        salary: Double,
        hasPets: Boolean,
        numberOfPets: Int,
        favoriteColor: String,
        favoriteFood: String
    ) {
        // Function body: Here you would use the parameters to
        // create and possibly return a complex object
        println("Creatinadsfadsfasfadsfdsag a complex object with the following properties:")
        println("adsfasdfasdsadfa: $name")
        println("Age: $age")
        // ... and so on for all parameters
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

    fun createCompany(companyName: String,
                      companyAddress: String,
                      companyCity: String,
                      companyCountry: String,
                      companyPostalCode: String,
                      companyPhoneNumber: String,
                      companyEmail: String,
                      companyWebsite: String,
                      companyIndustry: String,
                      foundingYear: Int,
                      employeeTotal: Int,
                      ceo: String,
                      cto: String,
                      hasBoard: Boolean,
                      boardMemberCount: Int,
                      isPublic: Boolean,
                      stockTicker: String,
                      revenue: Double,
                      income: Double,
                      hasInternationalPresence: Boolean,
                      internationalOfficeCount: Int,
                      mainOffering: String,
                      targetDemographic: String,
                      slogan: String,
                      missionStatement: String,
                      visionStatement: String,
                      values: List<String>,
                      departmentCount: Int,
                      hasBenefits: Boolean,
                      benefits: String,
                      averageCompensation: Double,
                      turnoverRate: Double,
                      customerSatisfaction: Double,
                      hasSocialMedia: Boolean,
                      socialMediaAccounts: List<String>,
                      usesCrm: Boolean,
                      crm: String,
                      hasCompetition: Boolean,
                      competitors: List<String>,
                      competitiveEdge: String,
                      awards: List<String>,
                      isEcoConscious: Boolean,
                      sustainability: String,
                      hasRemotePolicy: Boolean,
                      remoteDetails: String,
                      officeSpace: Int,
                      meetingRoomCount: Int,
                      hasEvents: Boolean,
                      culture: String,
                      feedbackRating: Double,
                      managementApproach: String,
                      techStack: List<String>,
                      projects: List<String>,
                      goals: List<String>
    ) {
        println("Creating a company with the following details:")
        println("Name: $companyName")
        println("Address: $companyAddress")
        // ... print other details ...
    }


}