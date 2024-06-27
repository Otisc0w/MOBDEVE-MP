package com.example.exercise3

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper



class DataBaseHandler(context: Context) : SQLiteOpenHelper(context, "mydb", null, 1 ) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE WORKOUTS(TITLE TEXT, MPART TEXT, VID TEXT, DSC TEXT)")
        //front muscles
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Bench Press', 'chest', 'YwK4sbSrtso', '1. Lay flat on the bench with your feet on the ground. With straight arms unrack the bar.\n2. Lower the bar to your mid chest\n3. Raise the bar until youve locked your elbows.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Pec Press', 'chest', 'D4l9wlY-E_g', '1. Use a handle attachment set all the way to the bottom of the machine.\n2. Bring both of the handles to your chest and make sure you are in the center of the cable crossover.\n3. Walk a few steps forward. Then press the weight forward. From there, your shoulders should horizontally abduct and adduct while your elbows stay in a fixed position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Pushups', 'chest', 'R4uGphXkSiQ', '1. Place your hands firmly on the ground, directly under shoulders.\n2. Flatten your back so your entire body is straight and slowly lower your body\n3. Draw shoulder blades back and down, keeping elbows tucked close to your body\n4. Exhale as you push back to the starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Chest Stretches', 'chest', '35FlY5yXSpw', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Dumbbell OHP', 'shoulders', 'fwc913-Yrns', '1. Start by standing with your feet shoulder-width apart and holding a dumbbell in each hand.\n2. Bring the dumbbells to your shoulders, with your palms facing forward and your elbows bent.\n3. From this starting position, extend your arms upwards so that the dumbbells are overhead.\n4. Make sure to keep your core engaged and your back straight throughout the movement.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Seated Dumbbell OHP', 'shoulders', 'C0We_bEyxlM', '1. Sit on a bench with back support. Raise the dumbbells to shoulder height with your palms forward.\n2. Raise the dumbbells upwards and pause at the contracted position.\n3. Lower the weights back to starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Pike Pushup', 'shoulders', 'xdV6RQ5N7ZU', '1. Use a bench or an object to elevate your feet.\n2. Lower your head towards the floor by bending your elbows\n3. Push through your hands and return to the starting pike position.\n4. Repeat')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Shoulder Stretches', 'shoulders', 'qLsgIzQ8_eQ', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Dumbbell Skull Crushers', 'triceps', 'ir5PsbniVSc', '1. Lay flat on the floor or a bench with your fists extended to the ceiling and a neutral grip.\n2. Break at the elbows until your fists are by your temples. Then extend your elbows and flex your triceps at the top.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Tricep Pushdown', 'triceps', 'hY74A8qxAec', '1. Anchor the band to a high point and face away. Hold the band with both hands, placing your hands shoulder-width apart and keeping your elbows close to your body.\n2. Slowly extend your arms downward, keeping your elbows close to your body. Push the band down as far as you can, feeling the contraction in your triceps.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Diamond Pushups', 'triceps', 'aIsJMMbnGHQ', '1. Position your index fingers and thumbs so they are touching, forming a diamond shape\n2. Use a standard push up position\n3. Lower your chest towards your hands, keep your elbows close to your body\n4. Stop just before your chest touches the floor, then push back up to the starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Tricep Stretches', 'triceps', '03XyeYNxOSc', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        //back muscles
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Lat-Pulldown', 'lats', 'TkVvPRALzLo', '1. Grip the bar with the palms facing forward, your hands need to be spaced out at a distance wider than shoulder width.\n2. As you have both arms extended in front of you holding the bar, bring your torso back around 30 degrees while sticking your chest out.\n3. Pull the bar down to about chin level or a little lower in a smooth movement whilst squeezing the shoulder blades together.\n4. After a second of squeezing, slowly raise the bar back to the starting position when your arms are fully extended.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Pullups', 'lats', 'K1WVCykpJbE', '1. Grasp the bar with an overhand grip, arms and shoulders fully extended.\n2. Pull your body up until your chin is above the bar.\n3. Lower your body back to starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Negative Pullups', 'lats', 'y00_rMYk1Oc', '1. Position yourself on the pullup bar using an overhand grip that’s slightly wider than your shoulders.\n2. Stand on a stool, block, or chair.\n3. Jump up so that your chin is just above the bar.\n4. Slowly lower your body back down to the starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Lat Stretches', 'lats', 'izMQh1NeyRU', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Barbell Rows', 'traps', 'v7nsz05s9oM', '1. Take a double overhand roughly shoulder width grip.\n2. Pull your elbows straight up the ceiling. Aim to get the bar to chin level or slightly higher.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Cable Rows', 'traps', 'G70PxKg1LTs', '1. Sit with your back straight on the machine and grip the handles.\n2. Pull the handles back using your arms. Your legs and torso should be at a 90° angle. Push out your chest.\n3. Pull the handles towards your body until your hands are beside your abdomen.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Inverted Rows', 'traps', 'hXTc1mDnZCw', '1. Lay underneath a fixed horizontal bar and grab the bar with a wide overhand grip.\n2. Pull your body straight up to the bar.\n3. Return to the starting position, your arms fully extended. Repeat.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Trap Stretches', 'traps', 'zgfZjH3xbNo', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('EZ-bar Curls', 'biceps', 'fRcQ5xXkKaY', '1. Grab an EZ bar (or barbell) with a shoulder width pronated (overhand) grip. \n2. Curl the weight until your forearms and your biceps touch one another. \n3. Lower the weight in a controlled manner and repeat. ')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Dumbbell Curls', 'biceps', 'P1FqV-oFn5M', '1. Stand up straight with a dumbbell in each hand at arms length.\n2. Raise one dumbbell and twist your forearm until it is vertical and your palm faces the shoulder.\n3. Lower to original position and repeat with opposite arm')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Chinups', 'biceps', 'LzFyJRr7-QU', '1. Grab the bar shoulder width apart with a supinated grip (palms facing you)\n2. With your body hanging and arms fully extended, pull yourself up until your chin is past the bar.\n3. Slowly return to starting position. Repeat.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Bicep Stretches', 'biceps', 'QY4gCIYbGQk', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        //leg muscles
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Leg-Press', 'quads', 'TaheFHslk-I', '1. Place your legs on the platform with your feet at shoulder width.\n2. Release the weight and extend your legs fully, without locking your knees.\n3. Lower the weight until your legs are at a 90° angle (but DO NOT allow your butt and lower back to rise off of the pad. This will put your lower back in a rounded position, which is very dangerous.)\n4. Raise the weight back to starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Leg Extensions', 'quads', 'ljO4jkwv8wQ', '1. Sit on the machine with your back against the cushion and adjust the machine you are using so that your knees are at a 90 degree angle at the starting position.\n2. Raise the weight by extending your knees outward, then lower your leg to the starting position. Both movements should be done in a slow, controlled motion.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Air Squats', 'quads', 'j9JqryGEaVA', '1. Stand with your feet shoulder width apart.\n2. flex your knees and hips and sit back into the squat while lowering your body\n3. Continue down to full depth\n4. Return to starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Quad Stretches', 'quads', 'XEMMNQsSEfk', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Smith Machine Deadlift', 'hamstrings', 'p6KK6yHxd4k', '1. Stand with a barbell at your shins with your feet shoulder width apart.\n2. Bend forward at your hips and keep your knees as fully extended as possible.\n3. Grab the barbell and then extend your hips while maintaining a straight back.\n4. From the standing position, lower the weight in a controlled manner.\n5. You can either lower the weight to the floor or before you touch the floor, depending on your mobility.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Leg-Curls', 'hamstrings', '3pIUYV5JqC8', '1. Lay on your back with a stability ball underneath your feet. \n2. Fully extend your knees and hips simultaneously. \n3. Flex your knees while keeping your hips extended. \n4. Flex your hamstrings and then return to the starting position. ')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Good-mornings', 'hamstrings', '7JB8TJVWIkY', '1. Stand with your feet a little past shoulder width apart with a slight bend at your knee. Place your hands behind the back of your head.\n2. Keeping your back straight, rotate your hips to bring your shoulders down towards the floor. Stop when your chest is parallel with the floor.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Hamstring Stretches', 'hamstrings', 'x5gunCRsSPU', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Machine-Calf Raise', 'calves', 'QCfQyNXEzS8', '1. Get comfortable on the machine, then place your lower thighs beneath the padded lever. Place your toes and the balls of your feet onto the foot supports. \n2. Prevent the weight from slipping forward by gripping the handles, and release the safety bar. Lower the weight until your calves are extended. \n3. Push your heels up to lift the padded lever and hold then contracted position, then slowly lower back down to the starting position. Repeat.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Bodyweight Calf Raise', 'calves', 'fQiMiUHWubw', '1. Balance on the balls of your feet on the platform or plates, leaning forward to use the wall to assist with balance.\n2. Lower the heels of your feet towards the ground and pause, then push through the balls of your feet like you are standing tip toe, pausing at the apex of the motion.\n3. Repeat as necessary.')")
        //TODO: add one more calve workout
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Calve Stretches', 'calves', 'I9kxjUarYQA', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        //core muscles
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Crunches', 'abs', 'QSkX3gA8cd0', '1. Lay flat on your back with your knees bent and your feet flat on the ground, about a foot from your lower back.\n2. Place your fingertips on your temples with your palms facing out.\n3. Draw your belly into the base of your spine to engage the muscles, then raise your head and shoulders off the floor. Return to starting position and repeat.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Ab Machine', 'abs', 'RGHQsDFzAsc', '1. Make sure that the seats height is correctly adjusted to your body so that your shoulders rest back comfortably on the padding.\n2. Select the weight load that you want to use and insert the pin into the corresponding hole. \n3. Flex your core, push against the padded lever, and bend forward at the waist. Your hips should stay in the seat at all times. Try to move in a slow, controlled manner. \n4. Breathe in as you come back to the starting position and finish the movement. The repetition is complete when your body returns to an upright position. From there, repeat as many reps as your training plan allows.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Leg Raise', 'abs', 'NNRLdKvkhJU', '1. Lay on your back with your arms palms down on either side.\n2. Keep your legs together and as straight as possible.\n3. Slowly raise your legs to a 90° angle, pause at this position, or as high as you can reach your legs, and then slowly lower your legs back down.\n4. Duration of these movements should be slow so that you do not utilize momentum, enabling you to get the most out of the exercise.')")
        //TODO: add two more ab workouts
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Ab Stretches', 'abs', 'soa9oz3RTVo', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Machine 45 Degree Back Extension', 'lowerback', 'JvqOW4W_aLA', '1. Position your thighs on the padding and hook your feet on the platform supports.\n2. Keeping your back straight, slowly bend at your waist until your legs and back are at a 45° angle.\n3. Slowly raise your body to the starting position.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Supermans', 'lowerback', 'p6bK1_Jo0b8', '1. Lie face down on the floor with your arms fully extended in front of you.\n2. Simultaneously raise your arms, legs and chest off of the floor and hold the position.\n3. Slowly lower your arms, legs and chest back to the starting position. Repeat.')")
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Kettle bell Swing', 'lowerback', 'm6DOWuBLs3U', '1. Stand with your feet slightly wider than shoulder width apart holding the kettlebell between your legs, with your knees slightly bent.\n2. Keeping your back straight, swing the kettlebell upwards until the kettlebell is level with your chest and carefully lower.\n3. Repeat')")
        //TODO: add two more lower back workouts
        db?.execSQL("INSERT INTO WORKOUTS(TITLE, MPART, VID, DSC) VALUES ('Lower Back Stretches', 'lowerback', 'DrkBSODtE5s', 'Stretching keeps the muscles flexible, strong, and healthy, and we need that flexibility to maintain a range of motion in the joints. Without it, the muscles shorten and become tight. Then, when you call on the muscles for activity, they are weak and unable to extend all the way. That puts you at risk for joint pain, strains, and muscle damage.')")

        //programs vv

        db?.execSQL("CREATE TABLE PROGRAM(WORKOUT TEXT, SETS INT, REPS INT)")
//        db?.execSQL("INSERT INTO PROGRAM(WORKOUT, SETS, REPS) VALUES ('pullups', '3', '8')")
//        db?.execSQL("INSERT INTO PROGRAM(WORKOUT, SETS, REPS) VALUES ('squats', '3', '12')")
//        db?.execSQL("INSERT INTO PROGRAM(WORKOUT, SETS, REPS) VALUES ('botches', '3', '11')")


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

//    fun readData() : MutableList<Content>{
//        var list: MutableList<Content> = ArrayList()
//
//        val db = this.readableDatabase
//        val query = "Select * from " + TABLE_NAME
//        val result = db.rawQuery(query,null)
//        if(result.moveToFirst()){
//            do{
//                var content = Content("1", 2, "1", "3")
//                content.title = result.getString(result.getColumnIndex(COL_TITLE))
//                content.image = result.getString(result.getColumnIndex(COL_IMAGE)).toInt()
//                content.duration = result.getString(resulta.getColumnIndex(COL_DURATION))
//                content.creator = result.getString(result.getColumnIndex(COL_CREATOR))
//
//                list.add(content)
//            }while (result.moveToNext())
//        }
//        result.close()
//        db.close()
//        return list
//    }
}