# MSM7x01A
   zreladdr-$(CONFIG_ARCH_MSM7X01A)	:= 0x10008000
params_phys-$(CONFIG_ARCH_MSM7X01A)	:= 0x10000100
initrd_phys-$(CONFIG_ARCH_MSM7X01A)	:= 0x10800000

# MSM8x60
   zreladdr-$(CONFIG_ARCH_MSM8X60)	:= 0x40208000

# MSM8960
   zreladdr-$(CONFIG_ARCH_MSM8960)	:= 0x80208000

# APQ8064
   zreladdr-$(CONFIG_ARCH_APQ8064)	:= 0x80208000


dtb-$(CONFIG_MACH_MSM8960_MMI) += mmi-8960pro.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-sasquatch-p1.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ghost-p0.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ghost-p1.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ghost-p2.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ghost-pc.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ghost-pd.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ghost-pe.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ghost-pf.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ultra-p0.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ultra-p1.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ultra-pf.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ultram-p0.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ultram-p1.dtb
dtb-$(CONFIG_MACH_MSM8960_MMI) += msm8960ab-ultram-pf.dtb
