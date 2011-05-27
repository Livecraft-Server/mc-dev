package net.minecraft.server;

public class ItemBoat extends Item {

    public ItemBoat(int i) {
        super(i);
        this.aX = 1;
    }

    public ItemStack a(ItemStack itemstack, World world, EntityHuman entityhuman) {
        float f = 1.0F;
        float f1 = entityhuman.y + (entityhuman.w - entityhuman.y) * f;
        float f2 = entityhuman.x + (entityhuman.v - entityhuman.x) * f;
        double d0 = entityhuman.m + (entityhuman.p - entityhuman.m) * (double) f;
        double d1 = entityhuman.n + (entityhuman.q - entityhuman.n) * (double) f + 1.62D - (double) entityhuman.G;
        double d2 = entityhuman.o + (entityhuman.r - entityhuman.o) * (double) f;
        Vec3D vec3d = Vec3D.b(d0, d1, d2);
        float f3 = MathHelper.b(-f2 * 0.017453292F - 3.1415927F);
        float f4 = MathHelper.a(-f2 * 0.017453292F - 3.1415927F);
        float f5 = -MathHelper.b(-f1 * 0.017453292F);
        float f6 = MathHelper.a(-f1 * 0.017453292F);
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        double d3 = 5.0D;
        Vec3D vec3d1 = vec3d.c((double) f7 * d3, (double) f6 * d3, (double) f8 * d3);
        MovingObjectPosition movingobjectposition = world.a(vec3d, vec3d1, true);

        if (movingobjectposition == null) {
            return itemstack;
        } else {
            if (movingobjectposition.a == 0) {
                int i = movingobjectposition.b;
                int j = movingobjectposition.c;
                int k = movingobjectposition.d;

                if (!world.z) {
                    world.a((Entity) (new EntityBoat(world, (double) ((float) i + 0.5F), (double) ((float) j + 1.5F), (double) ((float) k + 0.5F))));
                }

                --itemstack.a;
            }

            return itemstack;
        }
    }
}