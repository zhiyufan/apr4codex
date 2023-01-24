package com.codex;

import java.util.*;

public class Solution {

import java.util.*;

    public static class Skills {
        private Map<String, Skill> skills;
        private Map<String, Skill> skillAliases;
        private Map<String, List<Skill>> skillCategories;

        public static Skills create() {
            return new Skills().init();
        }

        public static Skills withSkills(Skill... skills) {
            return new Skills().init(skills);
        }

        public static Skills withSkills(Collection<Skill> skills) {
            return new Skills().init(skills);
        }

        public static Skills withAliases(Map<String, Skill> aliases) {
            return new Skills().init(aliases);
        }

        public static Skills withCategories(Map<String, List<Skill>> categories) {
            return new Skills().init(categories);
        }

        private Skills() {
            skills = new TreeMap<>();
            skillAliases = new TreeMap<>();
            skillCategories = new TreeMap<>();
        }

        private Skills init() {
            return this;
        }

        private Skills init(Collection<Skill> skills) {
            for (Skill skill : skills) {
                addSkill(skill);
            }
            return this;
        }

        private Skills init(Map<String, Skill> aliases) {
            for (Map.Entry<String, Skill> entry : aliases.entrySet()) {
                String alias = entry.getKey();
                Skill skill = entry.getValue();
                skillAliases.put(alias, skill);
            }
            return this;
        }

        private Skills init(Skill[] skills) {
            init(Arrays.asList(skills));
            return this;
        }

        private Skills init(Map<String, List<Skill>> categories) {
            for (Map.Entry<String, List<Skill>> entry : categories.entrySet()) {
                String category = entry.getKey();
                List<Skill> skills = entry.getValue();
                skillCategories.put(category, skills);
                for (Skill skill : skills) {
                    addSkill(skill);
                }
            }
            return this;
        }

        private Skills addSkill(Skill skill) {
            skills.put(skill.getName(), skill);
            return this;
        }

        public Skill getSkill(String skillName) {
            Skill skill = skills.get(skillName);
            if (skill == null) {
                skill = skillAliases.get(skillName);
            }
            return skill;
        }

        public Map<String, Skill> getSkills() {
            return skills;
        }

        public Map<String, Skill> getSkillAliases() {
            return skillAliases;
        }

        public Map<String, List<Skill>> getSkillCategories() {
            return skillCategories;
        }
    }

    public static class Skill {
        private String name;
        private List<Skill> prereqs;

        public static Skill named(String name) {
            return new Skill(name);
        }

        public static Skill named(String name, Skill... prereqs) {
            return new Skill(name, Arrays.asList(prereqs));
        }

        public static Skill named(String name, Collection<Skill> prereqs) {
            return new Skill(name, prereqs);
        }

        private Skill(String name, Collection<Skill> prereqs) {
            this.name = name;
            this.prereqs = new ArrayList<>(prereqs);
        }

        private Skill(String name) {
            this(name, Collections.emptyList());
        }

        public String getName() {
            return name;
        }

        public List<Skill> getPrereqs() {
            return prereqs;
        }

        public boolean hasPrereqs() {
            return !prereqs.isEmpty();
        }
    }

    public static class SkillNode {
        private Skill skill;
        private int isolationIndex;
        private int isolationLevel;
        private int isolationOrdinal;
        private boolean isPrereq;

        public SkillNode(Skill skill) {
            this.skill = skill;
        }

        public Skill getSkill() {
            return skill;
        }

        public int getIsolationIndex() {
            return isolationIndex;
        }

        public void setIsolationIndex(int isolationIndex) {
            this.isolationIndex = isolationIndex;
        }

        public int getIsolationLevel() {
            return isolationLevel;
        }

        public void setIsolationLevel(int isolationLevel) {
            this.isolationLevel = isolationLevel;
        }

        public int getIsolationOrdinal() {
            return isolationOrdinal;
        }

        public void setIsolationOrdinal(int isolationOrdinal) {
            this.isolationOrdinal = isolationOrdinal;
        }

        public boolean isPrereq() {
            return isPrereq;
        }

        public void setPrereq(boolean prereq) {
            isPrereq = prereq;
        }
    }
}