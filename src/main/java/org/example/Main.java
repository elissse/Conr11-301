package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Status[] statuses = new Status[]{Status.complete, Status.inProgress, Status.complete, Status.rejected};
        ProjectEnum[] projects = new ProjectEnum[]{ProjectEnum.schema, ProjectEnum.electronic, ProjectEnum.essay, ProjectEnum.table};
        Material[] materials = new Material[]{Material.bricks, Material.concrete, Material.diamonds, Material.glitter, Material.gold, Material.lime};
        int length = 4;
        int fails = 0;
        VeryReallyGoodConstruction vrgc = new VeryReallyGoodConstruction("thrift shop");
        System.out.println(vrgc);
        Project project = new Project("project");
        Foundation foundation = new Foundation("foundation");
        Walls wall = new Walls("walls");
        Roof roof = new Roof("roof");
        Furnish furnish = new Furnish("furnish");
        project.setStatus(Status.complete);
        project.setType(ProjectEnum.electronic);
        System.out.println(project + " is " + project.getStatus());
        try {
            vrgc.addStageEnd(project);
        } catch (RejectedStageException | RejectedProjectException o) {
            System.out.println(o.getMessage());
        }
        foundation.setStatus(Status.planned);
        foundation.setMaterial(Material.diamonds);
        System.out.println(foundation + " is " + foundation.getStatus());
        try {
            vrgc.addStageEnd(foundation);
        } catch (RejectedStageException | RejectedProjectException o) {
            System.out.println(o.getMessage());
        }
        wall.setStatus(Status.planned);
        wall.setMaterial(Material.bricks);
        System.out.println(wall + " is " + wall.getStatus());
        try {
            vrgc.addStageEnd(wall);
        } catch (RejectedStageException | RejectedProjectException o) {
            System.out.println(o.getMessage());
        }
        roof.setStatus(Status.planned);
        roof.setMaterial(Material.glitter);
        System.out.println(roof + " is " + roof.getStatus());
        try {
            vrgc.addStageEnd(roof);
        } catch (RejectedStageException | RejectedProjectException o) {
            System.out.println(o.getMessage());
        }
        while (true) {
            int status = random.nextInt(4);
            furnish.setStatus(statuses[status]);
            furnish.setMaterial(Material.pearls);
            System.out.println(furnish + " is " + furnish.getStatus());
            try {
                vrgc.addStageEnd(furnish);
                break;
            } catch (RejectedStageException | RejectedProjectException o) {
                System.out.println(o.getMessage());
            }
        }
    }
}