package com.iamwintrow.myquizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val qu1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(qu1)

        val qu2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.australia,
            "Argentina",
            "Australia",
            "New Zealand",
            "Austria",
            2
        )
        questionsList.add(qu2)

        val qu3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.belgium,
            "Serbia",
            "Australia",
            "New Zealand",
            "Belgium",
            4
        )
        questionsList.add(qu3)

        val qu4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.fiji,
            "Switzerland",
            "Fiji",
            "New Zealand",
            "Austria",
            2
        )
        questionsList.add(qu4)

        val qu5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.india,
            "Nigeria",
            "Australia",
            "Iran",
            "India",
            4
        )
        questionsList.add(qu5)

        val qu6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.newzealand,
            "New Zealand",
            "Australia",
            "England",
            "Austria",
            1
        )
        questionsList.add(qu6)

        val qu7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.brazil,
            "Brazil",
            "Uruguay",
            "Germany",
            "Austria",
            1
        )
        questionsList.add(qu7)

        val qu8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.germany,
            "Belgium",
            "Australia",
            "Germany",
            "Norway",
            3
        )
        questionsList.add(qu8)

        val qu9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.kuwait,
            "Saudi Arabia",
            "Kuwait",
            "Iraq",
            "Austria",
            2
        )
        questionsList.add(qu9)

        val qu10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.denmark,
            "Norway",
            "Sweden",
            "New Zealand",
            "Denmark",
            4
        )
        questionsList.add(qu10)

        return questionsList
    }
}