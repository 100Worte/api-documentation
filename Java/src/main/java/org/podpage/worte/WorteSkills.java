package org.podpage.worte;

import org.json.JSONObject;

public class WorteSkills {

    private Skills skills;

    public WorteSkills(JSONObject skillsJson)
    {
        skills = new Skills(skillsJson);
    }

    @Override
    public String toString() {
        return "WorteSkills {" +
                "skills=" + skills +" }";
    }

    public static class Skills {
        private double achievement;
        private double affiliation;
        private double analytics;
        private double contact;
        private double emotionality;
        private double leadership;
        private double selfConfidence;

        public Skills(JSONObject skills) {
            achievement = skills.getDouble("achievement");
            affiliation = skills.getDouble("affiliation");
            analytics = skills.getDouble("analytics");
            contact = skills.getDouble("contact");
            emotionality = skills.getDouble("emotionality");
            leadership = skills.getDouble("leadership");
            selfConfidence = skills.getDouble("selfConfidence");
        }

        @Override
        public String toString() {
            return "skills{" +
                    "achievement=" + achievement +
                    ", affiliation=" + affiliation +
                    ", analytics=" + analytics +
                    ", contact=" + contact +
                    ", emotionality=" + emotionality +
                    ", leadership=" + leadership +
                    ", selfConfidence=" + selfConfidence +
                    '}';
        }

        public double getAchievement() {
            return achievement;
        }

        public double getAffiliation() {
            return affiliation;
        }

        public double getAnalytics() {
            return analytics;
        }

        public double getContact() {
            return contact;
        }

        public double getEmotionality() {
            return emotionality;
        }

        public double getLeadership() {
            return leadership;
        }

        public double getSelfConfidence() {
            return selfConfidence;
        }
    }
}
