package com.iamwintrow.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val  CORRECT_ANSWERS : String = "correct_answers"

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

        val qu11 = Question(
            11, "What does this say?",
            R.drawable.chinese_one,
            "Nice to meet you",
            "Today is beautiful",
            "8 in the evening",
            "I am a wheelbarrow",
            3
        )
        questionsList.add(qu11)

        val qu12 = Question(
            12, "What does this say?",
            R.drawable.chinese_two,
            "What time is your flight?",
            "What is the weather like?",
            "Can you spare some change?",
            "Are you a human?",
            1
        )
        questionsList.add(qu12)

        val qu13 = Question(
            13, "What does this say?",
            R.drawable.chinese_three,
            "No, I am not going home",
            "Okay, I'll go with you",
            "Um, get away from me",
            "Yes (Correct), I am going home",
            4
        )
        questionsList.add(qu13)



        return questionsList
    }
}