package com.example.quizapp

object Constants {


    const val USER_NAME :String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        val que1= Question(
            1,"What country the flag belongs to?",
            R.drawable.argentina,
            "INDIA",
            "CHINA",
            "URUGUAY",
            "ARGENTINA",
            4
        )
        questionsList.add(que1)
        val que2=Question(2,
            "Who is this famous personality",
            R.drawable.shah_rukh_khan,
            "Ranbir Kapoor",
            "Shah Rukh Khan",
            "Saif Ali Khan",
            "Amir Khan",
            2
        )
        questionsList.add(que2)
        val que3=Question(3,
            "Who is this famous personality",
            R.drawable.deepika_padukone,
            "Aishwarya Rai Bachchan",
            "Kareena Kapoor",
            "Deepika Padukone",
            "Priyanka Chopra",
            3
        )
        questionsList.add(que3)
        val que4=Question(4,
            "Who is this famous personality",
            R.drawable.amitabh_bachchan,
            "Amitabh Bachchan",
            "Rakesh Khanna",
            "Dharmendra Deol",
            "Kishore Kumar",
            1
        )
        questionsList.add(que4)
        val que5=Question(
            5,
            "Which country won first FIFA?",
            R.drawable.fifa,
            "Argentina",
            "Uruguay",
            "Brazil",
            "Italy",
            2
        )
        questionsList.add(que5)
        val que6=Question(
            6,
            "Who is Prime Minister of India?",
            R.drawable.prime,
            "Rahul Gandhi",
            "Sonia Gandhi",
            "Narendra Modi",
            "Arvind Kejriwaal",
            3
        )
        questionsList.add(que6)
        val que7=Question(
            7,
            "What is the name of the country?",
            R.drawable.norway,
            "India",
            "Bangladesh",
            "Japan",
            "Norway",
            4
        )
        questionsList.add(que7)
        val que8=Question(
            8,
            "Who is the CEO of Google?",
            R.drawable.google,
            "Larry Page",
            "Tim Cook",
            "Sundar Pichai",
            "Satya Nadela",
            3
        )
        questionsList.add(que8)
        val que9=Question(
            9,
            "Who is this famous football?",
            R.drawable.lionel,
            "Luis Suárez",
            "Edinson Cavani",
            "Lionel Messi",
            "Critiano Ronaldo",
            3
        )
        questionsList.add(que9)
        return questionsList
    }

}